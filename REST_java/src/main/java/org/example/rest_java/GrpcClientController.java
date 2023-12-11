package org.example.rest_java;
import io.grpc.ManagedChannel;
import com.hw2.grpc.lib.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/charge")
public class GrpcClientController {

    private final ChargerGrpc.ChargerBlockingStub chargerStub;
    StringBuilder sb;

    GrpcClientController(ManagedChannel managedChannel) {
        chargerStub = ChargerGrpc.newBlockingStub(managedChannel);
    }

    @GetMapping(value="/get/{idx}")
    public String getChargeById(@PathVariable(name = "idx") int idx) {
        StringReply stringReply = chargerStub.getChargeById(
                IdRequest.newBuilder()
                        .setIdx(idx)
                        .build()
        );
        return stringReply.getMessage();
    }

    @GetMapping(value="/get/{genre}")
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

    @GetMapping(value="/get/{date}")
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

    @DeleteMapping(value="/delete/{idx}", consumes = "application/json")
    public String deleteChargeById(@PathVariable(name = "idx") int idx) {
        StringReply stringReply = chargerStub.deleteChargeById(
                IdRequest.newBuilder()
                        .setIdx(idx)
                        .build()
        );
        return stringReply.getMessage();
    }

    @PutMapping(value="/delete/all", consumes = "application/json")
    public String deleteChargeAll() {
        StringReply stringReply = chargerStub.deleteChargeAll(
                AllRequest.newBuilder()
                        .build()
        );
        return stringReply.getMessage();
    }
}
