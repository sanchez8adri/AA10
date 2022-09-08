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
						println "¿Qué le dice un .GIF a un .JPEG? -Anímate viejo"
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
						println "-Podriamos tener otro niño. \n-Sí, a mi tampoco me gusta el que tenemos"
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
						println "-¿Cómo se llama el peor jugador japonés? -Nikito Nitoko."
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
						println "Dos amigos hablando: -¿A quién le vas a votar en las próximas elecciones? -Yo, a Alibabá y los 40 ladrones. -¿Y éso? -Para asegurarme que solo sean 40."
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
