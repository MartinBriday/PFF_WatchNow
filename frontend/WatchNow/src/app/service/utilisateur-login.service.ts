import { environment } from './../../environments/environment';
import { Observable } from 'rxjs';
import { UtilisateurLogin } from './../model/utilisateur-login.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurLoginService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<UtilisateurLogin[]> {
    return this.httpClient.get<UtilisateurLogin[]>(environment.url + "utilisateur_login/index")
  }

  getById(id: number): Observable<UtilisateurLogin> {
    return this.httpClient.get<UtilisateurLogin>(environment.url + "utilisateur_login/index/" + id)
  }

  save(utilisateurLogin: UtilisateurLogin): Observable<UtilisateurLogin> {
    return this.httpClient.post<UtilisateurLogin>(environment.url + "utilisateur_login/save", utilisateurLogin)
  }

  delete(id: number): Observable<void> {
    return this.httpClient.delete<void>(environment.url + "utilisateur_login/delete/" + id)
  }

  update(utilisateurLogin: UtilisateurLogin): Observable<UtilisateurLogin> {
    return this.httpClient.put<UtilisateurLogin>(environment.url + "utilisateur_login/update", utilisateurLogin)
  }
}
