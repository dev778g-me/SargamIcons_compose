package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMoreSquareVert: ImageVector
    get() {
        if (_SiMoreSquareVert != null) {
            return _SiMoreSquareVert!!
        }
        _SiMoreSquareVert = ImageVector.Builder(
            name = "Filled.SiMoreSquareVert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 11.533f)
                curveToRelative(0f, -0.846f, 0.687f, -1.533f, 1.533f, -1.533f)
                horizontalLineToRelative(0.934f)
                curveToRelative(0.846f, 0f, 1.533f, 0.687f, 1.533f, 1.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.846f, -0.687f, 1.533f, -1.533f, 1.533f)
                horizontalLineToRelative(-0.934f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12.467f)
                close()
                moveTo(10f, 18.533f)
                curveToRelative(0f, -0.847f, 0.687f, -1.533f, 1.533f, -1.533f)
                horizontalLineToRelative(0.934f)
                curveToRelative(0.846f, 0f, 1.533f, 0.686f, 1.533f, 1.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.847f, -0.687f, 1.533f, -1.533f, 1.533f)
                horizontalLineToRelative(-0.934f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19.467f)
                close()
                moveTo(10f, 4.533f)
                curveTo(10f, 3.686f, 10.687f, 3f, 11.533f, 3f)
                horizontalLineToRelative(0.934f)
                curveTo(13.313f, 3f, 14f, 3.687f, 14f, 4.533f)
                verticalLineToRelative(0.934f)
                curveTo(14f, 6.314f, 13.313f, 7f, 12.467f, 7f)
                horizontalLineToRelative(-0.934f)
                arcTo(1.533f, 1.533f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.467f)
                close()
            }
        }.build()

        return _SiMoreSquareVert!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreSquareVert: ImageVector? = null
