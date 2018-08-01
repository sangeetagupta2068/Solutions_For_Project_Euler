
class Triplet{

    int height,base,hypotaneous;

    Triplet(int height, int base, int  hypotaneous){
        this.height = height;
        this.base = base;
        this.hypotaneous = hypotaneous;
    }

    public boolean validateTriplet(){

        boolean flag = true;
        if(this.height<=0||this.base<=0||this.hypotaneous<=0){
            flag = false;
        } else {
            if(height>=(base + hypotaneous)){
                flag = false;
            } else{
                if(base>=(height + hypotaneous)){
                    flag = false;
                } else{
                    if(hypotaneous>=(base + height)){
                        flag = false;
                    }
                }
            }
        }

        return flag;
    }

    public long sumOfTriplet(){
        return (height + base + hypotaneous);
    }

}
