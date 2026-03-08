package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiVerified: ImageVector
    get() {
        if (_SiVerified != null) {
            return _SiVerified!!
        }
        _SiVerified = ImageVector.Builder(
            name = "Filled.SiVerified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.007f, 8.27f)
                curveTo(22.194f, 9.125f, 23f, 10.45f, 23f, 12f)
                reflectiveCurveToRelative(-0.806f, 2.876f, -1.993f, 3.73f)
                curveToRelative(0.24f, 1.442f, -0.134f, 2.958f, -1.227f, 4.05f)
                curveToRelative(-1.095f, 1.095f, -2.61f, 1.459f, -4.046f, 1.225f)
                curveTo(14.883f, 22.196f, 13.546f, 23f, 12f, 23f)
                curveToRelative(-1.55f, 0f, -2.878f, -0.807f, -3.731f, -1.996f)
                curveToRelative(-1.438f, 0.235f, -2.954f, -0.128f, -4.05f, -1.224f)
                curveToRelative(-1.095f, -1.095f, -1.459f, -2.611f, -1.217f, -4.05f)
                curveTo(1.816f, 14.877f, 1f, 13.551f, 1f, 12f)
                reflectiveCurveToRelative(0.816f, -2.878f, 2.002f, -3.73f)
                curveToRelative(-0.242f, -1.439f, 0.122f, -2.955f, 1.218f, -4.05f)
                curveToRelative(1.093f, -1.094f, 2.61f, -1.467f, 4.057f, -1.227f)
                curveTo(9.125f, 1.804f, 10.453f, 1f, 12f, 1f)
                curveToRelative(1.545f, 0f, 2.88f, 0.803f, 3.732f, 1.993f)
                curveToRelative(1.442f, -0.24f, 2.956f, 0.135f, 4.048f, 1.227f)
                reflectiveCurveToRelative(1.468f, 2.608f, 1.227f, 4.05f)
                moveToRelative(-4.426f, -0.084f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.233f, 1.395f)
                lineToRelative(-5f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.521f, 0.126f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
                lineToRelative(2.165f, 2.165f)
                lineToRelative(4.314f, -6.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.395f, -0.232f)
            }
        }.build()

        return _SiVerified!!
    }

@Suppress("ObjectPropertyName")
private var _SiVerified: ImageVector? = null
