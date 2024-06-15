package br.com.etecia.ReciclagemInteligente;

public class Api {

    private static final String ROOT_URL = "http://10.67.96.85/ReciclagemInteligenteAPI/v1/Api.php?apicall=";

    public static final String URL_CREATE_USER = ROOT_URL + "createuser";
    public static final String URL_READ_USER = ROOT_URL + "getuser";
    public static final String URL_UPDATE_USER = ROOT_URL + "updateuser";
    public static final String URL_DELETE_USER = ROOT_URL + "deleteuser&id=";
}