package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMoreSquareHoriz: ImageVector
    get() {
        if (_SiMoreSquareHoriz != null) {
            return _SiMoreSquareHoriz!!
        }
        _SiMoreSquareHoriz = ImageVector.Builder(
            name = "Filled.SiMoreSquareHoriz",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.533f, 14f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12.467f)
                verticalLineToRelative(-0.934f)
                curveToRelative(0f, -0.846f, 0.687f, -1.533f, 1.533f, -1.533f)
                horizontalLineToRelative(0.934f)
                curveToRelative(0.846f, 0f, 1.533f, 0.687f, 1.533f, 1.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.846f, -0.687f, 1.533f, -1.533f, 1.533f)
                close()
                moveTo(18.533f, 14f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12.467f)
                verticalLineToRelative(-0.934f)
                curveToRelative(0f, -0.846f, 0.686f, -1.533f, 1.533f, -1.533f)
                horizontalLineToRelative(0.934f)
                curveToRelative(0.847f, 0f, 1.533f, 0.687f, 1.533f, 1.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.846f, -0.686f, 1.533f, -1.533f, 1.533f)
                close()
                moveTo(4.533f, 14f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.467f)
                verticalLineToRelative(-0.934f)
                curveTo(3f, 10.687f, 3.687f, 10f, 4.533f, 10f)
                horizontalLineToRelative(0.934f)
                curveTo(6.314f, 10f, 7f, 10.687f, 7f, 11.533f)
                verticalLineToRelative(0.934f)
                curveTo(7f, 13.313f, 6.314f, 14f, 5.467f, 14f)
                close()
            }
        }.build()

        return _SiMoreSquareHoriz!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreSquareHoriz: ImageVector? = null
