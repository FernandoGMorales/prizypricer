package server.prizypricer.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity(name = "store")
public class Store implements BusinessDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToOne(optional=false, mappedBy="store")
    private Adress adress;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private Set<PhoneNumber> phoneNumbers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private Set<Email> emails;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private Set<Price> prices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Set<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

    public Set<Price> getPrices() {
        return prices;
    }

    public void setPrices(Set<Price> prices) {
        this.prices = prices;
    }
}
