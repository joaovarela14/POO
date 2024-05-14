package aula09;


import java.util.LinkedList;
import java.util.List;



public class PlaneManager {
    LinkedList<Plane> frota_avioes = new LinkedList<Plane>();

        public void addPlane(Plane plane) {
        if (frota_avioes.contains(plane)){
            System.out.println("O avião já existe");
        }
        else{
            frota_avioes.add(plane);
        }

    }

    public void removePlane(String id ) {
        boolean removeu = false;
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem aviões na frota");
        }

        for (Plane plane : frota_avioes) {
            if (plane.getIdentificador().equals(id)) {
                frota_avioes.remove(plane);
                removeu = true;
                break;
            }
        }

        if (removeu == false){
            System.out.println("Não existe avião com esse identificador");
        }
    }


    public Plane searchPlane(String id) {
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem avioes na frota");
            return null;
        }
        else{
            for (Plane plane : frota_avioes) {
                if (plane.getIdentificador().equals(id)) {
                    return plane;
                }
            }
            System.out.println("Não existe avião com esse identificador");
            return null;
        }
    }


    public List<Plane> getCommercialPLanes(){
        List<Plane> avioes_comerciais = new LinkedList<Plane>();
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem aviões na frota!");
            return avioes_comerciais;
        }
        else{
            for (Plane plane : frota_avioes) {
                if (plane.getPlaneType().equals("Comercial")) {
                    avioes_comerciais.add(plane);
                }
            }

            if (avioes_comerciais.isEmpty()){
                System.out.println("Não existem aviões comerciais na frota");
                return null;
            }
            else{
                return avioes_comerciais;
            }
        }
    }


    public List<Plane> getMilitaryPlanes(){
        List<Plane> avioes_militares = new LinkedList<Plane>();
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem aviões na frota!");
            return null;
        }
        else{
            for (Plane plane : frota_avioes) {
                if (plane.getPlaneType().equals("Militar")) {
                    avioes_militares.add(plane);
                }
            }

            if (avioes_militares.isEmpty()){
                System.out.println("Não existem aviões militares na frota");
                return null;
            }
            else{
                return avioes_militares;
            }
        }
    }

    public void printAllPlanes() {
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem aviões na frota!");
        }
        else{
            for (Plane plane : frota_avioes) {
                System.out.println(plane);
            }
        }
    }

    public Plane getFastestPlane() {
        if (frota_avioes.isEmpty()){
            System.out.println("Não existem aviões na frota!");
            return null;
        }
        else{
            Plane aviao_mais_rapido = frota_avioes.get(0);
            for (Plane plane : frota_avioes) {
                if (plane.getVelocidade_máxima() > aviao_mais_rapido.getVelocidade_máxima()) {
                    aviao_mais_rapido = plane;
                }
            }
            return aviao_mais_rapido;
        }
    }



}