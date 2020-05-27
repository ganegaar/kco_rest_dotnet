using Newtonsoft.Json;

namespace Klarna.Rest.Core.Model
{
    /// <summary>
    /// DeliveryDetails.
    /// </summary>
    public class ShippingDeliveryDetails
    {
        /// <summary>
        /// Carrier product name.
        /// </summary>
        [JsonProperty(PropertyName = "carrier")]
        public string Carrier { get; set; }
        /// <summary>
        /// Type of shipping class.
        /// </summary>
        [JsonProperty(PropertyName = "class")]
        public string Class { get; set; }
        /// <summary>
        /// Upstream carrier product
        /// </summary>
        [JsonProperty(PropertyName = "product")]
        public ShippingCarrierProduct Product { get; set; }

        /// <summary>
        /// The selected location for this shipping 
        /// </summary>
        [JsonProperty(PropertyName = "pickup_location")]
        public ShippingPickupLocation PickupLocation { get; set; }

        /// <summary>
        /// The selected timeslot for this shipping
        /// </summary>
        [JsonProperty(PropertyName = "timeslot")]
        public ShippingTimeslot Timeslot { get; set; }
    }
}