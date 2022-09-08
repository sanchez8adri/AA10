import java.text.SimpleDateFormat
pipeline
{
	agent any
	stages
	{
		stage('Mostrar Fecha')
		{
			steps{
				script{
					def date = new Date()
					def sdf = new SimpleDateFormat("MM/dd/yyyy")
					println sdf.format(date)
				}
			}
		}
		stage('Jueves')
		{
			steps{
				script{
					def date = new Date()
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					
					if(day == 5){
						println "¿Que le dice un .GIF a un .JPEG? -Animate viejo"
					}
				}
			}
		}
		
		stage('Viernes')
		{
			steps{
				script{
					def date = new Date()
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					
					if(day == 6){
						println "-Podriamos tener otro niño. -Si, a mi tampoco me gusta el que tenemos"
					}
				}
			}
		}
		stage('Lunes')
		{
			steps{
				script{
					def date = new Date()
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					
					if(day == 2){
						println "-¿Como se llama el peor jugador japones? -Nikito Nitoko."
					}
				}
			}
		}
		stage('Martes')
		{
			steps{
				script{
					def date = new Date()
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					
					if(day == 3){
						println "Dos amigos hablando: -¿A quien le vas a votar en las proximas elecciones? -Yo, a Alibaba y los 40 ladrones. -¿Y eso? -Para asegurarme que solo sean 40."
					}
				}
			}
		}
		stage('Miercoles')
		{
			steps{
				script{
					def date = new Date()
					Calendar calendar = Calendar.getInstance();
				    	calendar.setTime(date);
				    	def day = calendar.get(Calendar.DAY_OF_WEEK);
					
					if(day == 4){
						println "– Doctor todo el mundo me ignora. – Que pase el siguiente por favor."
					}
				}
			}
		}
	}
}
