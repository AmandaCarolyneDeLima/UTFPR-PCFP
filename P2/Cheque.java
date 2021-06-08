//Amanda Carolyne de Lima
//Marco Amaral

public class Cheque {
    private int n;

    public void setValor(int n){
        this.n = n;

    }

    public String getValorPorExtenso(){
        String milhar ="";
        String centena="";
        String dezena="";
        String unidade="";

        //Unidade
        int nUnidade = this.n % 10;
        int nDezena;
        if (this.n % 100 >= 20){
            nDezena = ((this.n % 100) / 10) * 10;
        }else {
            nDezena = this.n % 100;
        }
        int nCentena = (int)((this.n % 1000)/100) * 100;

        //Milhar
        int nCentenaMilhar  = (this.n / 100000) * 100;

        int nDezenaMilhar;
        if ((this.n / 1000 )% 100 >= 20){
            nDezenaMilhar =  (((this.n / 1000) % 100) / 10) * 10;
        }else {
            nDezenaMilhar = (this.n / 1000) % 100;
        }

        int nUnidadeMilhar  = (this.n / 1000) % 10;

        switch(nUnidade){
            case 1 : unidade = "um"; break;
            case 2 : unidade = "dois"; break;
            case 3 : unidade = "três"; break;
            case 4 : unidade = "quatro"; break;
            case 5 : unidade = "cinco"; break;
            case 6 : unidade = "seis"; break;
            case 7 : unidade = "sete"; break;
            case 8 : unidade = "oito"; break;
            case 9 : unidade = "nove"; break;
        }

        switch(nDezena){
            case 10: dezena = "dez"; break;
            case 11: dezena = "onze"; break;
            case 12: dezena = "doze"; break;
            case 13: dezena = "treze"; break;
            case 14: dezena = "quatorze"; break;
            case 15: dezena = "quinze"; break;
            case 16: dezena = "dezesseis"; break;
            case 17: dezena = "dezessete"; break;
            case 18: dezena = "dezoito"; break;
            case 19: dezena = "dezenove"; break;
            case 20: dezena = "vinte"; break;
            case 30: dezena = "trinta"; break;
            case 40: dezena = "quarenta"; break;
            case 50: dezena = "cinquenta"; break;
            case 60: dezena = "sessenta"; break;
            case 70: dezena = "setenta"; break;
            case 80: dezena = "oitenta"; break;
            case 90: dezena = "noventa"; break;
        }

        switch(nCentena){
            case 100 : centena = "cento"; break;
            case 200 : centena = "duzentos"; break;
            case 300 : centena = "trezentos"; break;
            case 400 : centena = "quatrocentos"; break;
            case 500 : centena = "quinhentos"; break;
            case 600 : centena = "seiscentos"; break;
            case 700 : centena = "setecentos"; break;
            case 800 : centena = "oitocentos"; break;
            case 900 : centena = "novecentos"; break;
        }

        //--Swtich para casa de milhar
        String unidadeDeMilhar = "";
        String dezenaDeMilhar = "";
        String centenaDeMilhar = "";

        switch(nUnidadeMilhar){
            case 1 : unidadeDeMilhar = "um"; break;
            case 2 : unidadeDeMilhar = "dois"; break;
            case 3 : unidadeDeMilhar = "três"; break;
            case 4 : unidadeDeMilhar = "quatro"; break;
            case 5 : unidadeDeMilhar = "cinco"; break;
            case 6 : unidadeDeMilhar = "seis"; break;
            case 7 : unidadeDeMilhar = "sete"; break;
            case 8 : unidadeDeMilhar = "oito"; break;
            case 9 : unidadeDeMilhar = "nove"; break;
        }

        switch(nDezenaMilhar){
            case 10: dezenaDeMilhar = "dez"; break;
            case 11: dezenaDeMilhar = "onze"; break;
            case 12: dezenaDeMilhar = "doze"; break;
            case 13: dezenaDeMilhar = "treze"; break;
            case 14: dezenaDeMilhar = "quatorze"; break;
            case 15: dezenaDeMilhar = "quinze"; break;
            case 16: dezenaDeMilhar = "dezesseis"; break;
            case 17: dezenaDeMilhar = "dezessete"; break;
            case 18: dezenaDeMilhar = "dezoito"; break;
            case 19: dezenaDeMilhar = "dezenove"; break;
            case 20: dezenaDeMilhar = "vinte"; break;
            case 30: dezenaDeMilhar = "trinta"; break;
            case 40: dezenaDeMilhar = "quarenta"; break;
            case 50: dezenaDeMilhar = "cinquenta"; break;
            case 60: dezenaDeMilhar = "sessenta"; break;
            case 70: dezenaDeMilhar = "setenta"; break;
            case 80: dezenaDeMilhar = "oitenta"; break;
            case 90: dezenaDeMilhar = "noventa"; break;
        }

        switch(nCentenaMilhar){
            case 100 : centenaDeMilhar = "cento"; break;
            case 200 : centenaDeMilhar = "duzentos"; break;
            case 300 : centenaDeMilhar = "trezentos"; break;
            case 400 : centenaDeMilhar = "quatrocentos"; break;
            case 500 : centenaDeMilhar = "quinhentos"; break;
            case 600 : centenaDeMilhar = "seiscentos"; break;
            case 700 : centenaDeMilhar = "setecentos"; break;
            case 800 : centenaDeMilhar = "oitocentos"; break;
            case 900 : centenaDeMilhar = "novecentos"; break;
        }

        if (this.n < 10){
            return unidade + " reais";
        }

        if (this.n < 20){
            return dezena + " reais";
        }

        if (this.n < 100){
            System.out.println();
            return dezena + " e " + unidade + " reais";
        }

        if (this.n < 1000 && nDezena == 0 && nUnidade == 0) {
            if (this.n == 100) {
                return "cem";
            }
            return centena + " reais";
        }

        if (this.n < 1000 && nDezena < 20) {
            return centena + " e " + dezena + " reais";
        }

        if (this.n < 1000) {
            return centena + " e " + dezena + " e " + unidade + " reais";
        }

        //--Milhar
        if (this.n < 10000 && nCentena == 0 && nDezena == 0 && nUnidade == 0) {
            if (this.n == 1000) {
                return "mil" + " reais";
            }
            return unidadeDeMilhar + " mil " + " reais";
        }

         if (this.n < 10000 && nCentena == 0 && nDezena == 0){
            return unidadeDeMilhar + " mil e " + unidade + " reais";
        }

        if (this.n < 10000 && nCentena == 0){
            return unidadeDeMilhar + " mil e " + dezena + " e "+ unidade + " reais";
        }

        if (this.n < 10000){
            return unidadeDeMilhar + " mil e " + centena + " e " + dezena + " e "+ unidade + " reais";
        }

        if (this.n < 100000) {
           return dezenaDeMilhar + " e " + unidadeDeMilhar + " mil e " + centena + " e " + dezena + " e "+ unidade + " reais";
        }

        if (this.n < 1000000) {
            return centenaDeMilhar + " e " +dezenaDeMilhar + " e " + unidadeDeMilhar + " mil e " + centena + " e " + dezena + " e "+ unidade + " reais";
        }
        
        return "";
    }
}