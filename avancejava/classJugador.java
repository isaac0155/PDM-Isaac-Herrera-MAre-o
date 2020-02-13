package avancejava;

public class classJugador()
{
  private String nombreCompleto;
  private String apellidos;
  private int ci;
  private int edad;

  public String getNombreCompleto()
  {
    return nombreCompleto;
  }
  public void setNombreCompleto(String nombreCompleto)
  {
    this.nombreCompleto = nombreCompleto;
  }
  public String getApellidos()
  {
    return apellidos;
  }
  public void setApellidos(String apellidos)
  {
    this.apellidos = apellidos;
  }
  public int getCi()
  {
    return ci;
  }
  public void setCi(int ci)
  {
    this.ci = ci;
  }
  public int getEdad()
  {
    return edad;
  }
  public void setEdad(int edad)
  {
    this.edad = edad;
  }
  public classJugador(String nombre, String apellido, int CI, int eda)
  {
    this.nombreCompleto=nombre;
    this.apellidos=apellido;
    this.ci=CI;
    this.edad=eda;
  }
}
