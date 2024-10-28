package model.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public interface Convert<T> {


    T conver(T objeto,String uri);
}
