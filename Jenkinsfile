import java.text.SimpleDateFormat
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
					println sdf
				}
			}
		}
	}
}
