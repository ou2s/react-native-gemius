using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Gemius.RNReactNativeGemius
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeGemiusModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeGemiusModule"/>.
        /// </summary>
        internal RNReactNativeGemiusModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeGemius";
            }
        }
    }
}
