class NotComparableException extends Exception {
    private String message;

    public NotComparableException(Pet pet) {
        if (pet instanceof Cat) {
            this.message = "Exception: Cannot compare cats to other species";
        } else if (pet instanceof Dog) {
            this.message = "Exception: Cannot compare dogs to other species";
        } else {
            this.message = "Exception: No comparison possible";
        }
    }

    public String getErrMsg() {
        return this.message;
    }
}
