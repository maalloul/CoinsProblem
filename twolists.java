public static boolean isQuarterEquivalent(List<Coin> A, List<Coin> B) {
        boolean equal = true;
        int index1 = 0;
        int index2 = 0;
        while(equal != false){
        if(A.get(index1).getType().equals("quarter")){
            while(!(B.get(index2).getType().equals("quarter"))){
                index2++;
            }
            if(A.get(index1).getYear() != B.get(index2).getYear()){
               equal = false;
            }
        }
        else{
            index1++;
        }
        
        }
        if(equal){
        return true;
        }
        else{
        return false;
        }
        }