public class Professor extends Pessoa{

		private String formacao;
		private String dataAdm;
		private String idProf;
		
		public Professor(String formacao, String dataAdm, String idProf, String nome, String email, String cpf, String rg) {
			super(nome, email, cpf, rg);
			this.formacao = formacao;
			this.dataAdm = dataAdm;
			this.idProf = idProf;
			
		}
		
		public String getDataAdm() {
			return dataAdm;
		}
		public void setDataAdm(String dataAdm) {
			this.dataAdm = dataAdm;
		}
		public String getFormacao() {
			return formacao;
		}
		public void setFormacao(String formacao) {
			this.formacao = formacao;
		}
		public String getIdProf() {
			return idProf;
		}
		public void setIdProf(String idProf) {
			this.idProf = idProf;
		}
		
}
