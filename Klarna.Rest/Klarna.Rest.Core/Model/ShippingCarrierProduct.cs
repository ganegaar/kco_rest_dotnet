using Newtonsoft.Json;

namespace Klarna.Rest.Core.Model
{
    /// <summary>
    /// Shipping carrier Product
    /// </summary>
    public class ShippingCarrierProduct
    {
        /// <summary>
        /// Carrier product name
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }
        /// <summary>
        /// Carrier product identifier
        /// </summary>
        [JsonProperty(PropertyName = "identifier")]
        public string Identifier { get; set; }
    }
}