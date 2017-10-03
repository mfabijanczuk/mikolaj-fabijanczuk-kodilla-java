package com.kodilla.good.patterns.chalenges.Allegro;

public class InformationServiceImpl implements InformationService {
    @Override
    public void sendMail(AllegroUser user, Product product) {
        System.out.println(user.getEmail() + " : " + user.getName() + " kupiłeś produkt " + product.getName() + " w cenie: " + product.getPrize());
    }
}
