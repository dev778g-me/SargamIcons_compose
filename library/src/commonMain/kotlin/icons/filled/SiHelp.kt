package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHelp: ImageVector
    get() {
        if (_SiHelp != null) {
            return _SiHelp!!
        }
        _SiHelp = ImageVector.Builder(
            name = "Filled.SiHelp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                moveToRelative(-0.009f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(14.711f, 7.67f)
                curveToRelative(-0.93f, -1.586f, -2.934f, -2.16f, -4.552f, -1.211f)
                lineToRelative(-0.015f, 0.01f)
                curveTo(9.178f, 7.059f, 8.5f, 8.104f, 8.5f, 9.34f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                curveToRelative(0f, -0.47f, 0.253f, -0.899f, 0.683f, -1.163f)
                curveToRelative(0.631f, -0.362f, 1.415f, -0.157f, 1.802f, 0.504f)
                curveToRelative(0.371f, 0.632f, 0.17f, 1.421f, -0.492f, 1.812f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.664f, 2.885f)
                lineTo(10.829f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.621f)
                curveToRelative(0f, -0.467f, 0.244f, -0.91f, 0.666f, -1.153f)
                lineToRelative(0.005f, -0.003f)
                curveToRelative(1.586f, -0.93f, 2.16f, -2.934f, 1.21f, -4.552f)
            }
        }.build()

        return _SiHelp!!
    }

@Suppress("ObjectPropertyName")
private var _SiHelp: ImageVector? = null
