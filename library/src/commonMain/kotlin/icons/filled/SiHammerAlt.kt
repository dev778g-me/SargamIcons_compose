package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHammerAlt: ImageVector
    get() {
        if (_SiHammerAlt != null) {
            return _SiHammerAlt!!
        }
        _SiHammerAlt = ImageVector.Builder(
            name = "Filled.SiHammerAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveToRelative(13.766f, 13.08f)
                lineToRelative(2.91f, 2.91f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.547f, 0f)
                lineToRelative(2.404f, -2.404f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.545f)
                lineTo(17.95f, 7.364f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, -1.414f)
                lineTo(17.95f, 4.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.415f, 1.413f)
                lineToRelative(-3.677f, -3.676f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.545f, 0f)
                lineTo(7.909f, 4.677f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.546f)
                lineToRelative(2.91f, 2.91f)
                lineToRelative(-8.65f, 7.359f)
                lineToRelative(-0.059f, 0.054f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.677f)
                lineToRelative(0.566f, 0.566f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.732f, -0.06f)
                close()
                moveTo(12.348f, 11.661f)
                lineTo(12.238f, 11.551f)
                lineTo(3.503f, 18.983f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.022f, 0.826f)
                lineToRelative(0.565f, 0.566f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.827f, 0.02f)
                close()
            }
        }.build()

        return _SiHammerAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiHammerAlt: ImageVector? = null
