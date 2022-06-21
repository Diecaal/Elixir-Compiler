package es.uniovi.dlp.visitor.codegeneration.util;

public class ReturnStatementDTO {
    public int bytesLocals, bytesParams, bytesReturn;

    public ReturnStatementDTO(int bytesLocals, int bytesParams, int bytesReturn){
        this.bytesLocals = bytesLocals;
        this.bytesParams = bytesParams;
        this.bytesReturn = bytesReturn;
    }
}
