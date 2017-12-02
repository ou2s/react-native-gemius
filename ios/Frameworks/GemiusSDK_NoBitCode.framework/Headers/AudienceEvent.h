//
//  AudienceEvent.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "BaseEvent.h"

@interface GEMAudienceEvent : GEMBaseEvent

//Static methods
//---------------------------------------
+(void)flushBufferWithForce:(BOOL)force;
+(NSTimeInterval)eventLastSendTS;

@end
