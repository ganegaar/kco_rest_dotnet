using Newtonsoft.Json;

namespace Klarna.Rest.Core.Model
{
    /// <summary>
    /// Timeslot
    /// </summary>
    public class ShippingTimeslot
    {
        /// <summary>
        /// Id.
        /// </summary>
        /// <remarks>Required</remarks>
        [JsonProperty(PropertyName = "id")]
        public string Id { get; set; }

        /// <summary>
        /// Start time.
        /// </summary>
        /// <remarks>Required</remarks>
        [JsonProperty(PropertyName = "start")]
        public string Start { get; set; }

        /// <summary>
        /// End time.
        /// </summary>
        /// <remarks>Required</remarks>
        [JsonProperty(PropertyName = "end")]
        public string End { get; set; }
    }
}