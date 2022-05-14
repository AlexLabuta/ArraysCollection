/**
 * Middle Temperature on a hospital
 *
 * @Author Adaye
 * creat 2022-04-16   4:34
 **/
public class HospitalTemperature {
    private static final int numberOfPatient = 30;
    private static final float minTemparature = 32.0f;
    private static final float maxTemparature = 40.0f;
    private static final float minHealthyPatient = 36.2f;
    private static final float maxHealthyPatient = 36.9f;

    public static void main(String[] args) {
        double sumTemperatures = 0.0;
        int healtyPatient = 0;
        float[] temperatures = new float[numberOfPatient];
        for ( int i=0; i < temperatures.length; i++){
            temperatures[i] = (float)Math.random() * (maxTemparature - minTemparature) + minTemparature;
            sumTemperatures += temperatures[i];
        }

        double middleTemp = sumTemperatures / numberOfPatient;

        System.out.println("Средняя температура по больнице = " + String.format("%.1f",middleTemp));

        for ( int i = 0; i < temperatures.length; i++){
            if( temperatures[i] >= minHealthyPatient && temperatures[i] <= maxHealthyPatient ){
                healtyPatient = ++healtyPatient;
            }
            System.out.println(" Температура пациента № " + i + ": " + String.format("%.1f",temperatures[i]));

        }
        System.out.println(" Здоровых пациентов " + healtyPatient + " чел.");

    }
}
