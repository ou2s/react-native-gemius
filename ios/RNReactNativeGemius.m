
#import "RNReactNativeGemius.h"
#import <React/RCTLog.h>
#import <GemiusSDK/GemiusSDK.h>

@implementation RNReactNativeGemius

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(setAppInfo:(NSString *)app version:(NSString *)version)
{
    [[GEMConfig sharedInstance] setLoggingEnabled:YES];
    [[GEMConfig sharedInstance] setAppInfo:app version:version];
}

RCT_EXPORT_METHOD(setGemiusInfo:(NSString *)host scriptIdentifierIos:(NSString *)scriptIdentifierIos scriptIdentifierAndroid:(NSString *)scriptIdentifierAndroid)
{
    [[GEMAudienceConfig sharedInstance] setHitCollectorHost:host];
    [[GEMAudienceConfig sharedInstance] setScriptIdentifier:scriptIdentifierIos];
}


RCT_EXPORT_METHOD(sendPageViewedEvent)
{
    GEMAudienceEvent *event = [GEMAudienceEvent new];
    [event sendEvent];
}


@end
