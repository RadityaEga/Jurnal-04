    public class lagu {
        private String judulLagu;
        private String namaPenyanyi;

        public lagu (String judulLagu, String namaPenyanyi) {
            this.judulLagu = judulLagu;
            this.namaPenyanyi = namaPenyanyi;
        }

        public String getJudulLagu() {
            return this.judulLagu;
        }

        @Override
        public String toString() {
            return this.judulLagu + "(" + namaPenyanyi + ")";
        }
    }
