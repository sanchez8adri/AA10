import java.text.SimpleDateFormat
import java.time.LocalDateTime
pipeline
{
	agent any
	stages
	{
		stage('Fecha')
		{
			steps{
				script{
					def date = new Date()
					def sdf = new SimpleDateFormat("MM/dd/yyyy")
					println sdf.format(date)
					
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					println day
				}
			}
		}
	}
}
