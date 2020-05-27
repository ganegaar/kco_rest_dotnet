using Newtonsoft.Json;

namespace Klarna.Rest.Core.Model
{
    /// <summary>
    /// Pickup location
    /// </summary>
    public class ShippingPickupLocation
    {
        /// <summary>
        /// Id.
        /// </summary>
        /// <remarks>Required</remarks>
        [JsonProperty(PropertyName = "id")]
        public string Id { get; set; }
        /// <summary>
        /// Name.
        /// </summary>
        /// <remarks>Reqiured</remarks>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Pickup location address
        /// </summary>
        [JsonProperty(PropertyName = "address")]
        public CheckoutAddressInfo Address { get; set; }        
    }
}