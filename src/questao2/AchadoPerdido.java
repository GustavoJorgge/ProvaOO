package questao2;

import javax.swing.JOptionPane;

public class AchadoPerdido implements Publicacao{

    String titulo;
    String descricao;
    String foto;
    String tipo;
    String local_achado;
    String data_hora;
    String status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String BuscarTitulo(String tituloConsulta) {
        if(tituloConsulta.equals(this.titulo)){
            return "Titulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nLocal:" + getLocal_achado();
        }
        else {
            return "Não encontrado";
        }
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("\n" + "\nTitulo:" + getTitulo() + "\nFoto:" + getFoto() + "\nTipo:" + getTipo() + "\nStatus: " + getStatus());
    }
}
