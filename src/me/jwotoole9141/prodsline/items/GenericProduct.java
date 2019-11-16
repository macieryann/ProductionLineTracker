/*
 * AUTH: Jared O'Toole
 * DATE: Sat, Nov 2nd, 2019
 * PROJ: ProductionLineTracker
 * FILE: GenericProduct.java
 *
 * Defines the GenericProduct class.
 */

package me.jwotoole9141.prodsline.items;

/**
 * A representation of a generic product.
 *
 * <p>
 * This class is used to interact with the production line tracker while its database holds only
 * generic product data.
 * </p>
 *
 * @author Jared O'Toole
 */
public class GenericProduct extends Product {

  /**
   * Creates a generic product.
   *
   * <p>
   * A default id of 0 is automatically assigned.
   * </p>
   *
   * @param name  the display name
   * @param type  the item type
   * @param manuf the manufacturer name
   */
  public GenericProduct(String name, ItemType type, String manuf) {
    super(name, type, manuf);
  }

  /**
   * Creates a generic product with a known id.
   *
   * <p>
   * The id number of a product is automatically generated by the database. Therefore, this
   * constructor should only be used when fetching data from the database.
   * </p>
   *
   * @param id    the product id
   * @param name  the display name
   * @param type  the item type
   * @param manuf the manufacturer name
   */
  public GenericProduct(int id, String name, ItemType type, String manuf) {
    super(id, name, type, manuf);
  }
}
