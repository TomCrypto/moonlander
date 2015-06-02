
public class Timer extends Thread
{
	private Callback callback;
	private boolean flag = false;

	public Timer(Callback callback)
	{
		this.callback = callback;
	}

	public void term()
	{
		flag = true;
	}

	public void run()
	{
		while (!flag)
		{
			try
			{
				Thread.sleep(16); // 0.1s delay
				callback.OnTimer(1.0 / 60.0);
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}
