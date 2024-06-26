package org.project1.nhom8.service;

import org.project1.nhom8.dto.Cart;
import org.project1.nhom8.dto.CartDetail;
import org.project1.nhom8.model.SPCTModel;
import org.project1.nhom8.repository.SPCTRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreProductService {

    private final SPCTRepository spctRepository = new SPCTRepository();

    private Map<Integer, SPCTModel> storeProductModel;

    public StoreProductService() {
        this.storeProductModel = new HashMap<>();

        fetch();
    }

    public void fetch() {
        this.storeProductModel.clear();
        for (SPCTModel spct : spctRepository.findAvailable()) {
            this.storeProductModel.put(spct.getMaSPCT(), spct);
        }
    }

    public void fetch(String name) {
        this.storeProductModel.clear();
        for (SPCTModel spct : spctRepository.findAvailable(name)) {
            this.storeProductModel.put(spct.getMaSPCT(), spct);
        }
    }

//    public void refresh() {
//        for (SPCTModel prod : spctRepository.findAvailable()) {
//            this.storeProductModel.put(prod.getMaSPCT(), prod);
//        }
//    }

    public void refreshAdd(CartDetail cartDetail, Integer quantity) {

        int currentQuantity = this.storeProductModel.get(cartDetail.getProduct().getMaSPCT()).getSoluong();

        this.storeProductModel.get(cartDetail.getProduct().getMaSPCT()).setSoluong(currentQuantity - quantity);
    }

    public void refreshRemove(CartDetail cartDetail, Integer quantity) {

        int currentQuantity = this.storeProductModel.get(cartDetail.getProduct().getMaSPCT()).getSoluong();

        this.storeProductModel.get(cartDetail.getProduct().getMaSPCT()).setSoluong(currentQuantity + quantity);
    }

    public void refreshAll(List<Cart> carts) {
        for (Cart cart : carts) {
            for (CartDetail cd : cart.getProducts().values().stream().toList()) {
                this.refreshAdd(cd, cd.getQuantity());
            }
        }
    }

    public List<SPCTModel> getStoreProductAsList() {
        return this.storeProductModel.values().stream().toList();
    }

    public SPCTModel get(Integer key) {
        return this.storeProductModel.get(key);
    }

}
