import { TestBed } from '@angular/core/testing';

import { AdminHotelServiceService } from './admin-hotel-service.service';

describe('AdminHotelServiceService', () => {
  let service: AdminHotelServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminHotelServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
