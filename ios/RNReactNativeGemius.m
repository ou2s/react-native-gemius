
#import "RNReactNativeGemius.h"
#import <React/RCTLog.h>

@implementation RNReactNativeGemius

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(testMethod:(NSString *)test)
{
    RCTLogInfo(@"TESTING iOS %@", test);
}

@end
  
