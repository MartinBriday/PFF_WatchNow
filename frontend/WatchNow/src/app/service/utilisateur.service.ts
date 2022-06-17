import { environment } from './../../environments/environment';
import { Utilisateur } from './../model/utilisateur.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Utilisateur[]> {
    return this.httpClient.get<Utilisateur[]>(environment.url + "utilisateur/index")
  }

  getById(id: number): Observable<Utilisateur> {
    return this.httpClient.get<Utilisateur>(environment.url + "utilisateur/index/" + id)
  }

  getByLogin(login: string | null): Observable<Utilisateur> {
    return this.httpClient.get<Utilisateur>(environment.url + "utilisateur/index/login/" + login)
  }

  save(utilisateur: Utilisateur): Observable<Utilisateur> {
    return this.httpClient.post<Utilisateur>(environment.url + "utilisateur/save", utilisateur)
  }

  delete(id: number): Observable<void> {
    return this.httpClient.delete<void>(environment.url + "utilisateur/delete/" + id)
  }

  update(utilisateur: Utilisateur): Observable<Utilisateur> {
    return this.httpClient.put<Utilisateur>(environment.url + "utilisateur/update", utilisateur)
  }
}
