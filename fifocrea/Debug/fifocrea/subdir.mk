################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../fifocrea/fifocrea.c 

OBJS += \
./fifocrea/fifocrea.o 

C_DEPS += \
./fifocrea/fifocrea.d 


# Each subdirectory must supply rules for building sources it contributes
fifocrea/%.o: ../fifocrea/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


