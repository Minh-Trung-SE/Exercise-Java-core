public class StoreManagenment {
    private Store[] stores;

    public StoreManagenment(Store[] stores) {
        this.stores = stores;
    }

    public enum PHONE_TYPE {
        _5G,
        WIFT,
        BLUETOOTH,
        FULL
    }

    public int count5GGLWF(PHONE_TYPE phone_type){
        int count = 0;
        for(Store store: stores) {
            for(SmartPhone smartPhone: store.getPhones()){
                switch (phone_type){
                    case FULL:
                        if(smartPhone.isHas5G() && smartPhone.isHasBluetooth() && smartPhone.isHasWift()){
                            count ++;
                        }
                        break;
                    case _5G:
                        if(smartPhone.isHas5G()){
                            count++;
                        }
                        break;
                    case WIFT:
                        if(smartPhone.isHasWift()){
                            count++;
                        }
                    case BLUETOOTH:
                        if (smartPhone.isHasBluetooth()){
                           count++;
                        }
                        break;
                }
            }
        }
        return count;
    }

    public Store getMinMaxRevenue(boolean getMax){
        Store result = stores[0];
        if(getMax){
            for(Store store: stores){
                if(result.getTotalRevenue() >= store.getTotalRevenue()){
                    result = store;
                }
            }
            return result;
        }else{
            for(Store store: stores){
                if(result.getTotalRevenue() <= store.getTotalRevenue()){
                    result = store;
                }
            }
            return result;
        }
    }

    public Store getMinMaxSold(boolean getMaxSold){
        Store result = stores[0];
        if(getMaxSold){
            for(Store store: stores){
                if(result.getSold() >= store.getSold()){
                    result = store;
                }
            }
            return result;
        }else{
            for(Store store: stores){
                if(result.getSold() <= store.getSold()){
                    result = store;
                }
            }
            return result;
        }
    }

}
