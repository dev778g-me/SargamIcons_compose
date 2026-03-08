package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIEdit: ImageVector
    get() {
        if (_SiAIEdit != null) {
            return _SiAIEdit!!
        }
        _SiAIEdit = ImageVector.Builder(
            name = "Filled.SiAIEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.727f, 0.568f)
                lineToRelative(0.291f, 1.163f)
                lineToRelative(1.164f, 0.291f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.455f)
                lineToRelative(-1.164f, 0.291f)
                lineToRelative(-0.29f, 1.164f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.456f, 0f)
                lineToRelative(-0.29f, -1.164f)
                lineToRelative(-1.164f, -0.29f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.456f)
                lineToRelative(1.163f, -0.29f)
                lineToRelative(0.291f, -1.164f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.25f)
                moveTo(4.104f, 2.507f)
                curveToRelative(0.298f, -0.871f, 1.585f, -0.842f, 1.818f, 0.087f)
                lineToRelative(0.296f, 1.188f)
                lineToRelative(1.188f, 0.297f)
                curveToRelative(0.96f, 0.24f, 0.96f, 1.603f, 0f, 1.842f)
                lineToRelative(-1.188f, 0.297f)
                lineToRelative(-0.296f, 1.188f)
                curveToRelative(-0.24f, 0.96f, -1.603f, 0.96f, -1.843f, 0f)
                lineToRelative(-0.297f, -1.188f)
                lineToRelative(-1.188f, -0.297f)
                curveToRelative(-0.96f, -0.24f, -0.96f, -1.602f, 0f, -1.842f)
                lineToRelative(1.188f, -0.297f)
                lineToRelative(0.297f, -1.188f)
                close()
                moveTo(5f, 4.797f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.797f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5.203f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.203f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4.796f)
                moveTo(16.738f, 3.727f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.838f, 0f)
                lineToRelative(1.697f, 1.697f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.838f)
                lineToRelative(-1.909f, 1.91f)
                lineToRelative(-3.536f, -3.536f)
                close()
                moveTo(8.818f, 18.718f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.255f, 0.136f)
                lineToRelative(-3.536f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.588f, -0.588f)
                lineToRelative(0.707f, -3.535f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.137f, -0.256f)
                lineToRelative(8.838f, -8.839f)
                lineToRelative(3.536f, 3.536f)
                close()
            }
        }.build()

        return _SiAIEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIEdit: ImageVector? = null
