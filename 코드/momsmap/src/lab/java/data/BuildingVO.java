package lab.java.data;

public class BuildingVO {
	private String establishId; //�ü� id
	private String key;
	private String officeedu; //����û��
	private String subofficeedu;//��������û��
	private String kinderinfoId;//�Ϲ���ġ�� id
	private String kindername; //��ġ����
	private String establish;//��������
	private String archyy;//����⵵
	private String floorcnt;//�ǹ�����
	private String bldgprusarea; //�ǹ��������
	private String grottar; //�����Ѹ���
	public BuildingVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getEstablishId() {
		return establishId;
	}
	public void setEstablishId(String establishId) {
		this.establishId = establishId;
	}
	public String getOfficeedu() {
		return officeedu;
	}
	public void setOfficeedu(String officeedu) {
		this.officeedu = officeedu;
	}
	public String getSubofficeedu() {
		return subofficeedu;
	}
	public void setSubofficeedu(String subofficeedu) {
		this.subofficeedu = subofficeedu;
	}
	public String getKinderinfoId() {
		return kinderinfoId;
	}
	public void setKinderinfoId(String kinderinfoId) {
		this.kinderinfoId = kinderinfoId;
	}
	public String getKindername() {
		return kindername;
	}
	public void setKindername(String kindername) {
		this.kindername = kindername;
	}
	public String getEstablish() {
		return establish;
	}
	public void setEstablish(String establish) {
		this.establish = establish;
	}
	public String getArchyy() {
		return archyy;
	}
	public void setArchyy(String archyy) {
		this.archyy = archyy;
	}
	public String getFloorcnt() {
		return floorcnt;
	}
	public void setFloorcnt(String floorcnt) {
		this.floorcnt = floorcnt;
	}
	public String getBldgprusarea() {
		return bldgprusarea;
	}
	public void setBldgprusarea(String bldgprusarea) {
		this.bldgprusarea = bldgprusarea;
	}
	public String getGrottar() {
		return grottar;
	}
	public void setGrottar(String grottar) {
		this.grottar = grottar;
	}
	@Override
	public String toString() {
		return "BuildingVO [establishId=" + establishId + ", officeedu=" + officeedu + ", subofficeedu=" + subofficeedu
				+ ", kinderinfoId=" + kinderinfoId + ", kindername=" + kindername + ", establish=" + establish
				+ ", archyy=" + archyy + ", floorcnt=" + floorcnt + ", bldgprusarea=" + bldgprusarea + ", grottar="
				+ grottar + "]";
	}
	
	
}
