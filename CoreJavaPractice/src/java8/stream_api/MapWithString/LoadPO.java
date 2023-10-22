package java8.stream_api.MapWithString;

public class LoadPO {

	private Long id;
	private Long loadId;
	private Long poId;
	private Long supplierOrgId;

	public LoadPO() {
		super();
	}

	public LoadPO(Long id, Long loadId, Long poId, Long supplierOrgId) {
		super();
		this.id = id;
		this.loadId = loadId;
		this.poId = poId;
		this.supplierOrgId = supplierOrgId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLoadId() {
		return loadId;
	}

	public void setLoadId(Long loadId) {
		this.loadId = loadId;
	}

	public Long getPoId() {
		return poId;
	}

	public void setPoId(Long poId) {
		this.poId = poId;
	}

	public Long getSupplierOrgId() {
		return supplierOrgId;
	}

	public void setSupplierOrgId(Long supplierOrgId) {
		this.supplierOrgId = supplierOrgId;
	}

	@Override
	public String toString() {
		return "LoadPO [id=" + id + ", loadId=" + loadId + ", poId=" + poId + ", supplierOrgId=" + supplierOrgId + "]";
	}
}
