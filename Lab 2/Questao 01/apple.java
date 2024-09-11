public class apple implements FabricanteCelular {
    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("IPhoneX")){
            return new IPhoneX();
        }
        else if(modelo.equals("IPhoneS")){
            return new IPhoneS();
        }
        else {
            return null;
        }
    }
}
