package sub8;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung - powerOn...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung - Poweroff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung - ChUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samsung - ChDown...");
		
	}

	@Override
	public void SoundUp() {
		System.out.println("Samsung - SoundUp...");
		
	}

	@Override
	public void SoundDown() {
		System.out.println("Samsung - SoundDown...");
		
	}

}
