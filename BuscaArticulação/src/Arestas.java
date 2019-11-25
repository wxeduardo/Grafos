
class Aresta {
    
    private int v1;
    private int v2;
    private boolean PercorridoNaBusca; 

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public boolean getPercorridoNaBusca() {
        return this.PercorridoNaBusca;
    }

    public void setPercorridoNaBusca(boolean PercorridoNaBusca) {
        this.PercorridoNaBusca = PercorridoNaBusca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aresta other = (Aresta) obj;
        if (this.v1 != other.v1) {
            return false;
        }
        if (this.PercorridoNaBusca != other.PercorridoNaBusca) {
            return false;
        }
        return true;
    }
    
    
}
