package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCopyrightAlt: ImageVector
    get() {
        if (_SiCopyrightAlt != null) {
            return _SiCopyrightAlt!!
        }
        _SiCopyrightAlt = ImageVector.Builder(
            name = "Filled.SiCopyrightAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
                moveToRelative(-9.863f, -5f)
                curveToRelative(-1.303f, 0f, -2.436f, 0.493f, -3.227f, 1.431f)
                curveToRelative(-0.773f, 0.92f, -1.14f, 2.17f, -1.14f, 3.566f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 1.396f, 0.369f, 2.646f, 1.144f, 3.564f)
                curveToRelative(0.792f, 0.937f, 1.925f, 1.429f, 3.229f, 1.429f)
                curveToRelative(2.012f, 0f, 3.713f, -1.162f, 4.07f, -3.124f)
                lineToRelative(-1.968f, -0.358f)
                curveToRelative(-0.151f, 0.833f, -0.864f, 1.482f, -2.102f, 1.482f)
                curveToRelative(-0.773f, 0f, -1.325f, -0.275f, -1.701f, -0.72f)
                curveToRelative(-0.392f, -0.464f, -0.672f, -1.21f, -0.672f, -2.272f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -1.066f, 0.28f, -1.814f, 0.67f, -2.278f)
                curveToRelative(0.375f, -0.445f, 0.925f, -0.72f, 1.697f, -0.72f)
                curveToRelative(1.174f, 0f, 1.96f, 0.706f, 2.104f, 1.631f)
                lineToRelative(1.977f, -0.307f)
                curveTo(15.906f, 8.316f, 14.183f, 7f, 12.138f, 7f)
            }
        }.build()

        return _SiCopyrightAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyrightAlt: ImageVector? = null
