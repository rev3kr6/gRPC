package org.example.rest_java;
import io.grpc.ManagedChannel;
import com.hw2.grpc.lib.*;
import org.springframework.web.bind.annotation.*;
import io.grpc.StatusRuntimeException;

@RestController
public class GrpcClientController {

    private final ChargerGrpc.ChargerBlockingStub chargerStub;
    StringBuilder sb;

    GrpcClientController(ManagedChannel managedChannel) {
        chargerStub = ChargerGrpc.newBlockingStub(managedChannel);
    }

    @GetMapping(value="/getIdx/{idx}")
    public String getChargeById(@PathVariable(name = "idx") int idx) {
        StringReply stringReply = chargerStub.getChargeById(
                IdRequest.newBuilder()
                        .setIdx(idx)
                        .build()
        );
        return stringReply.getMessage();
    }

    @GetMapping(value="/getGenre/{genre}")
    public String getChargeByGenre(@PathVariable(name = "genre") String genre) {
        sb = new StringBuilder();
        GenreRequest genreRequest = GenreRequest.newBuilder()
                .setGenre(genre).build();
        chargerStub.getChargeByGenre(genreRequest)
                .forEachRemaining(StringReply -> {
                    sb.append(StringReply.getMessage()).append("\n");
                });
        return sb.toString();
    }

    @GetMapping(value="/getDate/{date}")
    public String getChargeByDate(@PathVariable(name = "date") String date) {
        sb = new StringBuilder();
        DateRequest dateRequest = DateRequest.newBuilder()
                .setDate(date).build();
        chargerStub.getChargeByDate(dateRequest)
                .forEachRemaining(StringReply -> {
                    sb.append(StringReply.getMessage()).append("\n");
                });
        return sb.toString();
    }

    @GetMapping(value="/get/all")
    public String getChargeAll() {
        sb = new StringBuilder();
        AllRequest allRequest = AllRequest.newBuilder().build();
        chargerStub.getChargeAll(allRequest)
                .forEachRemaining(StringReply -> {
                    sb.append(StringReply.getMessage()).append("\n");
                });
        return sb.toString();
    }

    @GetMapping(value="/get/cost")
    public long currentCostSum() {
        CostReply costReply = chargerStub.currentCostSum(
                AllRequest.newBuilder()
                        .build()
        );
        return costReply.getCost();
    }

    @PostMapping(value="/post", consumes = "application/json")
    public String postCharge(@RequestBody Charge charge) {
        StringReply stringReply = chargerStub.postCharge(
                ChargeRequest.newBuilder()
                        .setIdx(charge.getIdx())
                        .setCost(charge.getCost())
                        .setGenre(charge.getGenre())
                        .setDate(charge.getDate())
                        .setDescription(charge.getDescription())
                        .build()
        );
        return stringReply.getMessage();
    }

    @PutMapping(value="/put", consumes = "application/json")
    public String putCharge(@RequestBody Charge charge) {
        StringReply stringReply = chargerStub.putCharge(
                ChargeRequest.newBuilder()
                        .setIdx(charge.getIdx())
                        .setCost(charge.getCost())
                        .setGenre(charge.getGenre())
                        .setDate(charge.getDate())
                        .setDescription(charge.getDescription())
                        .build()
        );
        return stringReply.getMessage();
    }

    @PatchMapping(value="/patch", consumes = "application/json")
    public String patchCharge(@RequestBody Charge charge) {
        StringReply stringReply = chargerStub.patchCharge(
                ChargeRequest.newBuilder()
                        .setIdx(charge.getIdx())
                        .setCost(charge.getCost())
                        .setGenre(charge.getGenre())
                        .setDate(charge.getDate())
                        .setDescription(charge.getDescription())
                        .build()
        );
        return stringReply.getMessage();
    }

    @DeleteMapping(value="/delete/{idx}")
    public String deleteChargeById(@PathVariable(name = "idx") int idx) {
        StringReply stringReply = chargerStub.deleteChargeById(
                IdRequest.newBuilder()
                        .setIdx(idx)
                        .build()
        );
        return stringReply.getMessage();
    }

    @DeleteMapping(value="/delete")
    public String deleteChargeAll() {
        StringReply stringReply = chargerStub.deleteChargeAll(
                AllRequest.newBuilder()
                        .build()
        );
        return stringReply.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return "Error occured! Please retry.\n" + e.getMessage() + "\n";
    }

    @ExceptionHandler(StatusRuntimeException.class)
    public String handleStatusRuntimeException(StatusRuntimeException e) {
        return "gRPC StatusRuntimeException occured! Plesae retry.\n" + e.getStatus().getDescription() + "\n";
    }

    @ExceptionHandler(Throwable.class)
    public String handleThrowable(Throwable t) {
        return "Unexpected error occurred! Please retry.\n" + t.getMessage() + "\n";
    }
}
