import java.util.ArrayList;

class HobiOzelListesi {
	private Boolean[][] hobiler;
    private int index;

    public HobiOzelListesi(int maxOgrenciSayisi) {
        this.hobiler = new Boolean[maxOgrenciSayisi][4];
        this.index = 0;
    }

    public void addHobiListesi(boolean yurume, boolean kitapOkuma, boolean spor, boolean kodYazma) {
        hobiler[index] = new Boolean[]{yurume, kitapOkuma, spor, kodYazma};
        index++;
    }

    public Boolean[][] getHobiler() {
        return hobiler;
    }}