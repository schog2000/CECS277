package Risk;

public class CardsMission {
	private String mission;
	private int missionVal;
	public CardsMission(String mission, int missionVal) {
		this.mission = mission;
		this.missionVal = missionVal;
	}
	public String getMission() {
		return mission;
	}
	public int getMissionVal() {
		return missionVal;
	}
	public void setMissionVal(int missionVal) {
		this.missionVal = missionVal;
	}

}
