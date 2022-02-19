package com.sha.springbootbookseller.repository.projection;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public interface IPurchaseItem
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
