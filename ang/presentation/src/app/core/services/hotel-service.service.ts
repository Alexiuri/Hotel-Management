import { Injectable } from '@angular/core';
import { constants } from '../constants';
import { hotel } from '../../model/hotel';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelServiceService {

  private hotelUrl = '${constants.SERVICE_ROOT}/${constants.HOTELS}';

  constructor(private http: HttpClient) { }

  getAllHotels(): Observable<hotel[]>{
    return this.http.get<hotel[]>(this.hotelUrl + '/all');
  }
}
