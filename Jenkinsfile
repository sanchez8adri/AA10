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
					
					def dt = LocalDateTime.now()
					println dt.format(date)
				}
			}
		}
	}
}
