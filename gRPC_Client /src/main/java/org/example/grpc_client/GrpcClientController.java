package org.example.grpc_client;
import io.grpc.ManagedChannel;
import org.chb.examples.lib.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/charge")
public class GrpcClientController {

    private final ChargerGrpc.ChargerBlockingStub chargerStub;
    List<Charge> list = new ArrayList<>();

    GrpcClientController(ManagedChannel managedChannel) {
        chargerStub = ChargerGrpc.newBlockingStub(managedChannel);
    }

    @GetMapping(value="/get/{id}")
    public Charge getChargeById(@PathVariable(name = "id") int id) {
        Charge charge = Charge.newBuilder().setId(id).build();

        GetChargeReply getChargeReply = chargerStub.getChargeById(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getChargeReply.getCharge();
    }

    @GetMapping(value="/get/{genre}")
    public List<Charge> getChargeByGenre(@PathVariable(name = "genre") String genre) {
        list.clear();
        Charge charge = Charge.newBuilder().setGenre(genre).build();
        ChargeRequest chargeRequest = ChargeRequest.newBuilder()
                .setCharge(charge).build();
        chargerStub.getChargeByGenre(chargeRequest)
                .forEachRemaining(getChargeReply -> {
                    list.add(getChargeReply.getCharge());
                });
        return list;
    }

    @GetMapping(value="/get/{date}")
    public List<Charge> getChargeByDate(@PathVariable(name = "date") String date) {
        list.clear();
        Charge charge = Charge.newBuilder().setDate(date).build();
        ChargeRequest chargeRequest = ChargeRequest.newBuilder()
                .setCharge(charge).build();
        chargerStub.getChargeByDate(chargeRequest)
                .forEachRemaining(getChargeReply -> {
                    list.add(getChargeReply.getCharge());
                });
        return list;
    }

    @GetMapping(value="/get/all")
    public List<Charge> getChargeAll() {
        list.clear();
        Charge charge = Charge.newBuilder().build();
        ChargeRequest chargeRequest = ChargeRequest.newBuilder()
                .setCharge(charge).build();
        chargerStub.getChargeAll(chargeRequest)
                .forEachRemaining(getChargeReply -> {
                    list.add(getChargeReply.getCharge());
                });
        return list;
    }

    @GetMapping(value="/get/cost")
    public long currentCostSum() {
        Charge charge = Charge.newBuilder().build();

        GetCostReply getCostReply = chargerStub.currentCostSum(
                ChargeRequest.newBuilder()
                        .build()
        );
        return getCostReply.getCost();
    }

    @PostMapping(value="/post", consumes = "application/json")
    public String postCharge(@RequestBody Charge charge) {
        GetMessageReply getMessageReply = chargerStub.postCharge(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getMessageReply.getMessage();
    }

    @PutMapping(value="/put", consumes = "application/json")
    public String putCharge(@RequestBody Charge charge) {
        GetMessageReply getMessageReply = chargerStub.putCharge(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getMessageReply.getMessage();
    }

    @PatchMapping(value="/patch", consumes = "application/json")
    public String patchCharge(@RequestBody Charge charge) {
        GetMessageReply getMessageReply = chargerStub.putCharge(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getMessageReply.getMessage();
    }

    @DeleteMapping(value="/delete/{id}", consumes = "application/json")
    public String deleteChargeById(@PathVariable(name = "id") int id) {
        Charge charge = Charge.newBuilder().setId(id).build();
        GetMessageReply getMessageReply = chargerStub.deleteChargeById(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getMessageReply.getMessage();
    }

    @PutMapping(value="/delete/all", consumes = "application/json")
    public String deleteChargeAll() {
        Charge charge = Charge.newBuilder().build();
        GetMessageReply getMessageReply = chargerStub.deleteChargeAll(
                ChargeRequest.newBuilder()
                        .setCharge(charge)
                        .build()
        );
        return getMessageReply.getMessage();
    }
}
