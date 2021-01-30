package pers.jamie.domain;

public class MbBatchOpenDctDetails {
    String DocumentType;
    String DocumentId;
    String ChClientName;

    public MbBatchOpenDctDetails(String documentType, String documentId, String chClientName) {
        DocumentType = documentType;
        DocumentId = documentId;
        ChClientName = chClientName;
    }

    public MbBatchOpenDctDetails() {
    }

    public String getChClientName() {
        return ChClientName;
    }

    public void setChClientName(String chClientName) {
        ChClientName = chClientName;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String documentType) {
        DocumentType = documentType;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String documentId) {
        DocumentId = documentId;
    }
}
