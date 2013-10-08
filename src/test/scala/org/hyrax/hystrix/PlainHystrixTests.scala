package org.hyrax.hystrix

import org.scalatest.FlatSpec

/**
 * Created with IntelliJ IDEA.
 * User: rzr
 * Date: 10/5/13
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
class PlainHystrixTests extends FlatSpec{

  "Synchronous request" should "return the elevation of Mt. Everest from Google Maps" in {
    val result = new FirstCommand().execute()
    assert( result === "8815.7158203125 meters")
  }


}
